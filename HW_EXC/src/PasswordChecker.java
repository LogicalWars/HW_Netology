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
        int count = 0;
        boolean isRepeats = false;
        boolean isLength = false;
        for (int i = 0; i < password.length(); i++) {
            for (int j = i + 1; j < password.length(); j++) {
                if (password.charAt(i) == password.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count >= repeats) {
                isRepeats = true;
            } else {
                count = 0;
            }
        }
        if (password.length() < length) {
            isLength = true;
        }
        return !isLength && !isRepeats;
    }
}
