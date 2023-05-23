package basics;

public class Strings {
    public static void main(String[] args) {
        //homework
        String text1 = "Java class";
        System.out.println(text1.isBlank());
        System.out.println(text1.isEmpty());
        System.out.println(text1.length() > 0);
        System.out.println(text1.substring(3));
        System.out.println(text1.substring(5));

        int length = text1.length();
        System.out.println(length);

        System.out.println(text1.substring(5, 10));


        String php = "PHP Exercises and";
        String python = "Python Exercises";
        System.out.println(php.concat(python));
        System.out.println(php.length() + python.length());
        System.out.println(php.equals(python));
        System.out.println(php.replace("PHP" , "java"));

        System.out.println("");


        System.out.println("=====================================");
        String test = " ";

        String name = " Anis";
        String name1 = "anis";
        System.out.println(name.equalsIgnoreCase(name1));


        String lastname = "Siam";

        String text = "Hello from java";

        System.out.println(name == name1);  // By ref

        String name2 = new String("Anis");
        System.out.println(name == name2);  // By ref

        System.out.println(name.equals(name2));

        System.out.println(name + lastname);

        System.out.println("anis" + "Saim");

        int result = name.length() + name1.length();
        System.out.println(result);

        System.out.println(name.length());
        System.out.println(name);
        name = name.trim();// with update on name
        //name.trim();//no update
        System.out.println(name);

        System.out.println(name.concat(" " + name1));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf("A"));
        System.out.println(name.lastIndexOf("A"));

        System.out.println(text.indexOf("o"));//4
        System.out.println(text.lastIndexOf("o"));//8

        System.out.println(text.charAt(0));

        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(1));
        System.out.println(name1.charAt(2));
        System.out.println(name1.charAt(3));

        System.out.println(text.substring(4));
        System.out.println(text.substring(4, 8));

        System.out.println(text.contains(" java"));

        String email = "anis.siam.cs@gmail.com";

        System.out.println(email.contains("@"));

        System.out.println(email.startsWith("anis"));
        System.out.println(email.endsWith("m"));


        System.out.println("Anis siam\b");
        System.out.println("Anis siam\t asadz");
        System.out.println("Anis siam\r asadz");

        System.out.println("anis\'siam\'");
        System.out.println("anis\\siam\\");
    }
}
