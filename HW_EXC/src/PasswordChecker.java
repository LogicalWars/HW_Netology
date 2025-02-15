public class PasswordChecker {
    private int length;
    private int repeats;

    public void setMinLength(int length) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Некорректное значение минимальной длины пароля");
        } else {
            this.length = length;
        }
    }

    public void setMaxRepeats(int repeats) throws IllegalArgumentException {
        if (repeats <= 0) {
            throw new IllegalArgumentException("Некорректное значение допустимого количества повторений символа подряд");
        } else {
            this.repeats = repeats;
        }
    }

    public boolean verify(String password) throws IllegalStateException {
        if (length == 0 || repeats == 0) {
            throw new IllegalStateException("Не установлены параметры на чекера");
        }

        if (password.length() < length) {
            return false;
        }

        int count = 0;
        char previousChar = password.charAt(0);
        for (char passwordChar : password.toCharArray()) {
            if (passwordChar == previousChar) {
                count ++;
                if (count > repeats) {
                    return false;
                }
            } else {
                count = 1;
                previousChar = passwordChar;
            }
        }
        return true;
    }
}
