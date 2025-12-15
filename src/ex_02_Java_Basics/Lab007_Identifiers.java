
package ex_02_Java_Basics;

public class Lab007_Identifiers {

    public static void main() {
         /*   ### Identifiers
            names those will be used to identify the programming elements like classes, methods, variables, etc uniquely.



        #### **Rules to follow when you define an Identifier:**
                    1. Identifier can contain Alphabets, Digits, and two special symbol i.e. Dollar ($), _,.
                    2. Underscore (_).
                    3. First character of an identifier must be an Alphabet(a-z,A-Z) or Dollar ($) or Underscore (_).
                    4. Keywords or Reserved words can't be used as Identifiers.
        */

            /*    In Java, identifiers are the custom names programmers give to various elements in a program,
                such as variables, methods, classes, interfaces, and packages. They act as unique labels
                that allow both the compiler and developers to refer to specific components in the code.
                Mandatory Rules for Valid Identifiers
                For an identifier to be valid in Java, it must strictly follow these syntax rules:
                Permitted Characters: It can only contain alphanumeric characters (A-Z, a-z, 0-9),
                underscores (_), and dollar signs ($).
                Starting Character: It must begin with a letter, an underscore (_), or a dollar sign ($).
               It cannot start with a digit.
                No Reserved Keywords: You cannot use Java reserved keywords (like int, class, public, if) as identifiers.
                Case Sensitivity: Java is case-sensitive; myVariable, MyVariable, and MYVARIABLE are three distinct identifiers.
                No Whitespace: Identifiers cannot contain spaces. Use camelCase or underscores instead.
                        Length: There is no official limit on the length of an identifier, though keeping
                                them concise is recommended.
                Examples of Valid vs. Invalid Identifiers
                Valid Identifiers 	Invalid Identifiers	Reason for Invalidity
                age	3age	Starts with a digit
                _count	total-amount	Hyphen is not allowed
                $salary	first name	Contains a space
                totalValue	class	Reserved keyword
                        User_123	value@num	Special character @ not allowed
                Naming Conventions (Best Practices)
                While not enforced by the compiler, following these conventions makes your code professional and readable:
                Classes and Interfaces: Use PascalCase (e.g., StudentDetails, DataProcessor).
                Variables and Methods: Use camelCase (e.g., calculateTotal(), firstName).
                Constants: Use UPPER_CASE with underscores (e.g., MAX_VALUE, PI).
                Packages: Use all lowercase letters, often in a reverse domain format (e.g., com.example.project).
                Common Errors
            "Identifier Expected" Error: This typically occurs if you use a reserved keyword as a name or start an identifier with a digit.
                Underscore Limitation: Starting from Java 9, a single underscore (_) alone is no longer allowed as an identifier.

                */


    }

}
