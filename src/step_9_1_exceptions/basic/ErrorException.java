package step_9_1_exceptions.basic;

public class ErrorException {
    /*
    Errors
    AssertionError	Диагностическая проверка прошла неуспешно
    InternalError	Непредвиденная внутренняя ошибка виртуальной машины
    OutOfMemoryError	Виртуальная машина не может выделить память под объект
    StackOverflowError	Переполнение стека из-за глубокой рекурсии программы
    ThreadDeath	Происходит, когда поток вызывает устаревший метод stop()
    UnknownError	Происходит неизвестная, но серьезная ошибка виртуальной машины
    VirtualMachineError	Происходит, когда виртуальная машина сломана или не хватает ресурсов

    Exceptions
    ClassNotFoundException	Класс не найден
    CloneNotSupportedException	Попытка клонировать объект, который не поддерживает операцию клонирования
    ConnectException	Попытка подключить сокет к удаленному адресу и порту
    EOFException	Когда при чтении неожиданно достигнут конец файла или потока данных
    IllegalAccessException	Доступ к классу отклонен
    InstantiationException	Попытка создать объект абстрактного класса или интерфейса
    InterruptedException	Один поток прерывает другой поток
    InvalidClassException	Когда в процессе сериализации возникают проблемы с классом
    InvalidObjectException	Когда один или более десериализованных объектов не прошли валидацию
    IOException	Общий класс исключений, вызванных неудачными или прерванными операциями ввода-вывода
    MalformedURLException	Когда адрес URL некорректный
    NoSuchFieldException	Требуемое поле не существует
    NoSuchMethodException	Требуемый метод не существует
    NotSerializableException	Класс не является сериализуемым
    ObjectStreamException	Общий класс для всех исключений с объектными потоками ввода/вывода
    ReflectiveOperationException	Общий класс исключений, определяющий ошибки при использовании рефлексии
    SocketException	Ошибка создания сокета или доступа к нему
    UnknownHostException	IP-адрес хоста не может быть определен

    RuntimeExceptions
    ArithmeticException	Арифметическая ошибка типа деления на ноль
    ArrayIndexOutOfBoundsException	Индекс массива находится вне границ
    ArrayStoreException	Сохранение в элементе массива объекта несовместимого типа
    ClassCastException	Недопустимое приведение типов
    IllegalArgumentException	Методу передан некорректный аргумент
    IllegalMonitorStateException	Незаконная операция монитора
    IllegalStateException	Среда или приложение находятся в неподходящем состоянии для вызова метода
    IllegalThreadStateException	Требуемая операция не совместима с текущим состоянием потока
    IndexOutOfBoundsException	Некоторый тип индекса находится вне диапазона
    NegativeArraySizeException	Массив создавался с отрицательным размером
    NullPointerException	Недопустимое использование нулевой ссылки
    NumberFormatException	Попытка преобразовать строку в один из числовых типов, но строка не имеет соответствующего формата.
    SecurityException	Попытка нарушить защиту
    StringIndexOutOfBoundsException	Индекс символа строки находится вне границ
    UnsupportedOperationException	Встретилась неподдерживаемая операция
     */
}
