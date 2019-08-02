package jsonparser;

public interface JsonParser<T> {
    T parse(String jsonContent);

}
