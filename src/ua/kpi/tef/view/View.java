package ua.kpi.tef.view;

import ua.kpi.tef.model.entity.Group;

import java.util.Arrays;

public class View {
    public static void print(String message){
        System.out.println(message);
    }

    public static String concatMessage(String...message){
        StringBuilder sb = new StringBuilder();
        for (String s : message) {
            sb.append(s);
        }
        return sb.toString();
    }

    public void showWrongInput() {
        print(StringConstants.WRONG_INPUT_DATA);
    }

    public void showWrongNickName() {
        print(StringConstants.WRONG_NICKNAME);
    }

    public void inputName() { print(StringConstants.INPUT_NAME); }

    public void inputSurname() { print(StringConstants.INPUT_SURNAME); }

    public void inputPatronymic() {
        print(StringConstants.INPUT_PATRONYMIC);
    }

    public void inputNickname() {
        print(StringConstants.INPUT_NICKNAME);
    }

    public void inputHomeNumber() {
        print(StringConstants.INPUT_HOME_NUMBER);
    }

    public void inputMobileNumber1() {
        print(StringConstants.INPUT_MOBILE_NUMBER1);
    }

    public void inputMobileNumber2() {
        print(StringConstants.INPUT_MOBILE_NUMBER2);
    }

    public void inputEmail() {
        print(StringConstants.INPUT_EMAIL);
    }

    public void inputSkype() {
        print(StringConstants.INPUT_SKYPE);
    }

    public void inputIndex() {
        print(StringConstants.INPUT_INDEX);
    }

    public void inputTown() {
        print(StringConstants.INPUT_TOWN);
    }

    public void inputStreet() {
        print(StringConstants.INPUT_STREET);
    }

    public void inputHouseNumber() {
        print(StringConstants.INPUT_HOUSE_NUMBER);
    }

    public void inputApartmentNumber() {
        print(StringConstants.INPUT_APARTMENT_NUMBER);
    }

    public void inputComment() {print(StringConstants.INPUT_COMMENT);}

    public void inputGroup() {
        print(StringConstants.INPUT_GROUP);
    }

    public void printAllGroups() {
        print(Arrays.toString(Group.values()));
    }
}
