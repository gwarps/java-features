/*
 * Code tested with docker image adoptopenjdk/openjdk14:debian-slim
 * Compilation: javac --enable-preview --source 14 Demo.java
 * Run: java --enable-preview Demo
 */
public class Demo {
   public static void main(String[] args) {
      System.out.println("Text Blocks Example");

      
      String address = """
                 25 Main Street
                 Anytown, USA, 12345
                 """;
      System.out.println(address);

      System.out.println("""
                       <person>
                           <firstName>Bob</firstName>
                           <lastName>Jones</lastName>
                       </person>
                       """);

      // Indentation controlled by closing delimeter
      // 4 space less stripped from content, hence we get 4 space indentation
      System.out.println("""
                       <person>
                           <firstName>Bob</firstName>
                           <lastName>Jones</lastName>
                       </person>
                   """);

      // Doing same thing as above programtically
      System.out.println("""
                       <person>
                           <firstName>Bob</firstName>
                           <lastName>Jones</lastName>
                       </person>
                       """.indent(4));

      // No whitespacing
      System.out.println("""
                       <person>
                           <firstName>Bob</firstName>
                           <lastName>Jones</lastName>
                       </person>
""");

      // Where you indent with respect to code doesn't matter
      // What matters is relative difference between last delimiter and code block
      System.out.println("""
<person>
    <firstName>Bob</firstName>
    <lastName>Jones</lastName>
</person>
""");

   // Embedding expression
   String first = "John";
   String last = "Doe";
   String person = """
                <person>
                    <firstName>%s</firstName>
                    <lastName>%s</lastName>
                </person>
                """.formatted(first, last));


   }
}
