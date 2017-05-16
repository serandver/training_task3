package ua.kpi.tef.model.entity;

public class SubscriberContacts {
    private String localPhone;
    private String cellPhone1;
    private String cellPhone2;
    private String email;
    private String skype;

    public SubscriberContacts() {
    }

    public SubscriberContacts(String localPhone, String cellPhone1, String cellPhone2, String email, String skype) {
        this.localPhone = localPhone;
        this.cellPhone1 = cellPhone1;
        this.cellPhone2 = cellPhone2;
        this.email = email;
        this.skype = skype;
    }

    public String getLocalPhone() {
        return localPhone;
    }

    public void setLocalPhone(String localPhone) {
        this.localPhone = localPhone;
    }

    public String getCellPhone1() {
        return cellPhone1;
    }

    public void setCellPhone1(String cellPhone1) {
        this.cellPhone1 = cellPhone1;
    }

    public String getCellPhone2() {
        return cellPhone2;
    }

    public void setCellPhone2(String cellPhone2) {
        this.cellPhone2 = cellPhone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubscriberContacts that = (SubscriberContacts) o;

        if (!localPhone.equals(that.localPhone)) return false;
        if (!cellPhone1.equals(that.cellPhone1)) return false;
        if (cellPhone2 != null ? !cellPhone2.equals(that.cellPhone2) : that.cellPhone2 != null) return false;
        if (!email.equals(that.email)) return false;
        return skype.equals(that.skype);
    }

    @Override
    public int hashCode() {
        int result = localPhone.hashCode();
        result = 31 * result + cellPhone1.hashCode();
        result = 31 * result + (cellPhone2 != null ? cellPhone2.hashCode() : 0);
        result = 31 * result + email.hashCode();
        result = 31 * result + skype.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SubscriberContacts{" +
                "localPhone='" + localPhone + '\'' +
                ", cellPhone1='" + cellPhone1 + '\'' +
                ", cellPhone2='" + cellPhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }
}
