package vista;

public interface Vista {
    void showHeader(int size);
    void showMemoryAdvice();
    void showInfo(String msg);
    void showResult(String label, int max, long ms);
    void showWarning(String msg);
}
