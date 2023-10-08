import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<BazaDate> dataStack = new Stack<>();
        while (true) {

                System.out.println("\\\\\\_____Menu_____/////");
                System.out.println("1. Add Person");
                System.out.println("2. Validate Age");
                System.out.println("3. Update Address");
                System.out.println("4. Update Full Name");
                System.out.println("5. Generate Email");
                System.out.println("6. Display Information");
                System.out.println("7. Search person id");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        BazaDate newPerson = createPerson(scanner);
                        dataStack.push(newPerson);
                        System.out.println("Person added.");
                        break;
                    case 2:
                        performOperation(dataStack, 2, scanner);
                        break;
                    case 3:
                        performOperation(dataStack, 3, scanner);
                        break;
                    case 4:
                        performOperation(dataStack, 4, scanner);
                        break;
                    case 5:
                        performOperation(dataStack, 5, scanner);
                        break;
                    case 6:
                        performOperation(dataStack, 6, scanner);
                        break;
                    case 7:
                        System.out.print("Enter the person's id (0 to " + (dataStack.size() - 1) + "): ");
                        int personIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        if (personIndex >= 0 && personIndex < dataStack.size()) {
                            BazaDate selectedPerson = dataStack.get(personIndex);
                            System.out.println("Selected person id " + personIndex + ":");
                            System.out.println(selectedPerson.toString());
                        } else {
                            System.out.println("Invalid index.");
                        }
                        break;
                    case 8:
                        System.out.println("Exiting. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");

            }
        }
    }
    private static BazaDate createPerson(Scanner scanner) {
        System.out.print("Enter sex (Male/Female): ");
        String sex = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter CNP: ");
        int CNP = scanner.nextInt();
        System.out.println("Enter administrative division(Judet)");
        String judet=scanner.nextLine();
        System.out.print("Enter locality: ");
        String locality = scanner.nextLine();
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter street number: ");
        int streetNumber = scanner.nextInt();
        System.out.print("Enter age: ");
        double age = scanner.nextDouble();
        System.out.print("Enter postal code: ");
        int postalCode = scanner.nextInt();
        scanner.nextLine();

        return new BazaDate(sex, firstName, lastName, CNP, locality, street, streetNumber, age, postalCode,judet);
    }

    private static void performOperation(Stack<BazaDate> dataStack, int operation, Scanner scanner) {
        System.out.print("Enter the person's id (0 to " + (dataStack.size() - 1) + "): ");
        int personIndex = scanner.nextInt();
        scanner.nextLine();

        if (personIndex >= 0 && personIndex < dataStack.size()) {
            BazaDate currentPerson = dataStack.get(personIndex);
            switch (operation) {
                case 2:
                    boolean isAdult = currentPerson.validateAge();
                    System.out.println("Is the person an adult? " + isAdult);
                    if (isAdult) {
                        System.out.println("Enter the driving license details:");
                        System.out.print("Model: ");
                        String model = scanner.next();
                        System.out.print("\nColor: ");
                        String color = scanner.next();
                        System.out.print("Type: ");
                        String type = scanner.next();
                        permis drivingLicense = new permis(model, color, type);
                        System.out.println("Dream car created: " + drivingLicense.toString());
                    }
                    break;
                case 3:
                    System.out.print("New locality: ");
                    String newLocality = scanner.nextLine();
                    System.out.print("New street name: ");
                    String newStreet = scanner.nextLine();
                    System.out.print("New street number: ");
                    int newStreetNumber = scanner.nextInt();
                    System.out.print("New postal code: ");
                    int newPostalCode = scanner.nextInt();
                    scanner.nextLine();
                    currentPerson.updateAdress(newLocality, newStreet, newStreetNumber, newPostalCode);
                    System.out.println("Address updated.");
                    break;
                case 4:
                    System.out.print("Enter new first name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter new last name: ");
                    String newLastName = scanner.nextLine();
                    currentPerson.updateFull_name(newFirstName, newLastName);
                    System.out.println("Full name updated.");
                    break;
                case 5:
                    String email = currentPerson.generateEmail();
                    System.out.println("Generated email: " + email);
                    break;
                case 6:
                    System.out.println(currentPerson.toString());
                    break;
            }
        } else {
            System.out.println("Invalid id.");
        }
    }
}
