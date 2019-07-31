package com.bdg.concurency;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindLink {

        public String content;

        //"I am going to redirect https:// this url / : https://www.google.com bye.";

        private final String urlPrefix = "https://";

          int n = urlPrefix.length();
        public FindLink(String content) {
            this.content = content;
        }


        public List<String> getLinks() {
            if (!content.contains(urlPrefix)) {
                return Collections.emptyList();
            }

            final List<String> urls = new ArrayList<>();
            int middlewarePosition = content.indexOf(urlPrefix);


            while (this.containsUrl(middlewarePosition) && content.charAt(middlewarePosition -1) == ' '  ) {


                for (int i = middlewarePosition + this.urlPrefix.length(); i < this.content.length(); i++) {
                    if ( content.substring(middlewarePosition, i).contains(urlPrefix+ "www")) {
                        if (symbolInRange('A', content.charAt(i), 'Z') ||
                                symbolInRange('a', content.charAt(i), 'z') || content.charAt(i) == '.') {
                            continue;
                        }
                        urls.add(content.substring(middlewarePosition, i));
                        break;
                    } else if (content.charAt(i) == ' ' && content.substring(middlewarePosition, i).contains(" ")) {
                        middlewarePosition = i;
                        continue;
                    }

                }

            }
            return urls;


        }

        private boolean symbolInRange(char start, char symbol, char end) {
            return symbol >= start && symbol <= end;
        }

        private boolean containsUrl(int fromIndex) {
            return this.content.substring(fromIndex).contains(urlPrefix);
        }




        public static void main(String[] args) throws InterruptedException {
            FindLink a = new FindLink(" I am going to redirect https:// this url / : https://www.google.com bye.");

            System.out.println(a.getLinks());
            System.out.println(a.n);
        }


    }

    enum Domains {
        com(".com"), org(".org"), ru(".ru");

        private String domainName;

        Domains(String domainName) {
            this.domainName = domainName;
        }

        public String domainName() {
            return this.domainName;
        }
    }


