package leetcode.easy.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {

    // time: O(N * M) | space: O(N * M)
    static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email: emails) {
            StringBuilder cleanMail = new StringBuilder();
            StringBuilder domainName = new StringBuilder();
            // iterate over each character in email
            for (int i = 0; i < email.length(); i++) {
                char currentChar = email.charAt(i);

                if (currentChar == '+' || currentChar == '@') break;
                if (currentChar != '.') cleanMail.append(currentChar);
            }

            // compute domain name (substring from end to '@')
            for (int i = email.length() - 1; i >= 0; i--) {
                char currentChar = email.charAt(i);
                domainName.append(currentChar);
                if (currentChar == '@') break;
            }

            domainName.reverse();
            cleanMail.append(domainName);
            uniqueEmails.add(cleanMail.toString());
        }
        return uniqueEmails.size();
    };

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com" };
        System.out.println(numUniqueEmails(emails));
    }
}
