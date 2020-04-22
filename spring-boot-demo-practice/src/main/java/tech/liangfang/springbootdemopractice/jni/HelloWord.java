package tech.liangfang.springbootdemopractice.jni;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/22 15:08
 */
public class HelloWord {
    public native void sayHelloWorld();

    static {
        System.loadLibrary("HelloWorldImpl");
    }

    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
        helloWord.sayHelloWorld();
    }
}
