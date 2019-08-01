package json.parser;

public interface JsonParser<T> {
    T parse(String content);
}
