package com.BankAccount.storage;

import com.BankAccount.entity.AbstractBankEntity;
import com.BankAccount.exception.FileStorageWriteException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStorage<T extends AbstractBankEntity> implements Storage<T> {
    private File fileStorage;

    public FileStorage(String directory, String name, String extension) throws IOException {
        if (new File(directory).mkdir()) {
            this.fileStorage = new File(directory + "/" + name + "." + extension);
            this.fileStorage.createNewFile();
        }
    }

    public File getFileStorage(String directory, String name, String extension) {
        String filePathString = directory + "/" + name + "." + extension;
        Path path = Paths.get(filePathString);
        if (Files.exists(path)) {
            this.fileStorage = new File(filePathString);
        }
        return this.fileStorage;
    }

    @Override
    public int storageSize() {
        return 0;
    }

    @Override
    public T add(T entity) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.fileStorage.getPath(), true));
            bufferedWriter.write(entity.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();

            return entity;
        } catch (IOException ex) {
            throw new FileStorageWriteException();
        }
    }


    @Override
    public T remove(int id) {
        BufferedReader fileReader;
        BufferedWriter fileWriter;
        File tempFile = new File(this.fileStorage.getPath() + ".deleted");
        String line = "id=" + id;
        try {
            fileReader = new BufferedReader(new FileReader(this.fileStorage.getPath()));
            fileWriter = new BufferedWriter(new FileWriter(tempFile));
            String temp;
            while (!((temp = fileReader.readLine()) == null)) {
                if (temp.contains(line)) {
                    System.out.println(temp);
                    continue;
                }
                fileWriter.write(temp);
                fileWriter.newLine();
            }
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new FileStorageWriteException();
        }
        return null;
    }


    @Override
    public T get(int id) {
        return null;
    }
}
