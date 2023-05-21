package basics;

public class Strings {
    public static void main(String[] args) {
        String test = " ";

        String name = " Anis" ;
        String name1 = "Anis";
        String lastname = "Siam";

        String text = "Hello from java";

        System.out.println(name==name1);  // By ref

        String name2 = new String("Anis");
        System.out.println(name==name2);  // By ref

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

        System.out.println(name.concat(" "+name1));

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
        System.out.println(text.substring(4,8));

        System.out.println(text.contains(" java"));

        String email = "anis.siam.cs@gmail.com";

        System.out.println(email.contains("@"));

        System.out.println(email.startsWith("anis"));
        System.out.println(email.endsWith("m"));

    }
}
