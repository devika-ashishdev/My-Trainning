public classPerson {
    private static String name;
    private static int age;

    public static void setNameAndAge(String n, int a) {
        name = n;
        age = a;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void main(String[] args) {
        setNameAndAge("John Doe", 25);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}





