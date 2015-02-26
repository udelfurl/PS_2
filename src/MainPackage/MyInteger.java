package MainPackage;
class MyInteger {
public static void main(String[] args) {
    MyInteger a = new MyInteger(5);
    System.out.println("is a even? " + a.isEven());
    System.out.println("is a prime? " + a.isPrime());
    System.out.println("is 3 prime? " + MyInteger.isPrime(3));
    char[] chars = {'1', '3', '5', '7'};
    System.out.println(MyInteger.parseInt(chars));
    String s = "1357";
    System.out.println(MyInteger.parseInt(s));
    MyInteger b = new MyInteger(24);
    System.out.println("is b odd? " + b.isOdd());
    System.out.println("is 36 odd? " + MyInteger.isOdd(36));
    System.out.println("is a equal to b? " + a.equals(b));
    System.out.println("is a equal to 5? " + a.equals(5));
}



int value;

MyInteger(int newValue) {
    value = newValue;
}
public int getValue() {
    return value;
}
public static boolean isEven(int n) {
    return (n % 2 == 0);
}
public static boolean isOdd(int n) {
    return !isEven(n);
}
public static boolean isPrime(int n) {
    for (int f = 2; f < n / 2; f++) {
        if (n % f == 0) {
            return false;
        }
    }
    return true;
}
public static boolean isEven(MyInteger n) {
    return n.isEven();
}
public static boolean isOdd(MyInteger n) {
    return n.isOdd();
}
public static boolean isPrime(MyInteger n) {
    return n.isPrime();
}
public boolean equals(MyInteger n) {
    return equals(n.getValue());
}
public boolean equals(int n) {
    return (value == n);
}

public boolean isEven() {
    return isEven(value);
}
public boolean isOdd() {
    return isOdd(value);
}
public boolean isPrime() {
    return isPrime(value);
}

public static int parseInt(String s) {
    return Integer.parseInt(s);
}
public static int parseInt(char[] s) {
    return parseInt(new String(s));
}
}


