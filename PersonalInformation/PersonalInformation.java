
public class PersonalInformation {

    public static void main(String[] args) {

        // Write a program that displays the following information,
        // each on a separate line:
        // Your name
        // Your address, with city, state, and ZIP
        // Your telephone number
        // Your college major
        // Although these items should be displayed on separate output lines,
        // use only a single println statement in your program.

        String name = "Brian Shewan";
        String address = "5685 Leeds St.";
        String city = "Halifax";
        String province = "NS";
        String postalCode = "B3K 2T3";
        String phone = "1-902-491-4684";
        String diploma = "Database Administration";

        System.out.println(
                name + "\n" + address + "\n" + city + "\n" +
                province + "\n" + postalCode + "\n" + phone + "\n" +
                diploma
        );
    }

}
