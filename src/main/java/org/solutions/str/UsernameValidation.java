package org.solutions.str;

/**
 * <ol>
 * <li>
 * The username consists of 8 to 30 characters inclusive.
 * If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
 * </li>
 * <li>
 * The username can only contain alphanumeric characters and underscores (_).
 * Alphanumeric characters describe the character set consisting of lowercase characters [a-z],
 * uppercase characters [A-Z], and digits [0-9].
 * </li>
 * <li>
 * The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z]
 * or uppercase character [A-Z].
 * </li>
 * </ol>
 * <h3>Example:</h3>
 * <table border='1'>
 *  <tr>
 *   <th>Username</th><th>Is Valid?</th>
 *  </tr>
 *  <tr>
 *   <td>Julia</td><td>No; Length is < 8 characters</td>
 *  </tr>
 *  <tr>
 *   <td>Samantha</td><td>Yes</td>
 *  </tr>
 *  <tr>
 *   <td>Samantha_21</td><td>Yes</td>
 *  </tr>
 *  <tr>
 *   <td>1Samantha</td><td>No; Number at the beginning</td>
 *  </tr>
 *  <tr>
 *   <td>Samantha?10_2A</td><td>No; Invalid character '?'</td>
 *  </tr>
 * </table>
 */
public class UsernameValidation {

    final String pattern = "^[A-Za-z_]\\w{7,29}$";
}
