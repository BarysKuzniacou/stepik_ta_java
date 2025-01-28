package step_12_1_enums.Example03_methods;

public enum DocumentStatus {
    NEW(31), // Значения указываются в круглых скобках рядом с именем константы
    DRAFT(23),
    PUBLISHED(52),
    ARCHIVED(77); // Перечисление констант завершается точкой с запятой

    private int statusCode; // Переменная экземпляра для хранения значения константы

    private DocumentStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() { // Метод доступа к значению константы
        return statusCode;
    }
}
