package home.netology.javacore.lambda.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
