package main.java.home.netology.javacore.lambda.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
