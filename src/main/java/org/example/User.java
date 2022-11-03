package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {

        // as-is
        /*RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = randomPasswordGenerator.generatePassword();*/

        // to-be : 결합을 느슨하게 만든다.
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >=8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
