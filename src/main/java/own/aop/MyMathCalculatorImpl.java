package own.aop;

public class MyMathCalculatorImpl implements Calculator {
    public int add(int i, int j) {
        System.out.println("【add】：参数为" + i + "," + j);
        int result = i + j;
        System.out.println("【add】：结果为" + result);
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("【sub】：参数为" + i + "," + j);
        int result = i - j;
        System.out.println("【sub】：结果为" + result);
        return result;
    }

    public int mul(int i, int j) {
        System.out.println("【mul】：参数为" + i + "," + j);
        int result = i * j;
        System.out.println("【mul】：结果为" + result);
        return result;
    }

    public int div(int i, int j) {
        System.out.println("【div】：参数为" + i + "," + j);
        int result = i / j;
        System.out.println("【div】：结果为" + result);
        return result;
    }
}
