static class Singleton {

    private static Singleton instance = null;
    private String str = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getValue() {
        return this.str;
    }

    public void setValue(String value) {
        str = value;
    }
    
}
