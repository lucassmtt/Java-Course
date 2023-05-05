package entities.entities;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Client {
    public String name;
    public String email;
    public Date birthDate;
    public Calendar calendar = new GregorianCalendar();
    public Client(){}
    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        calendar.setTime(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        calendar.setTime(birthDate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Client: \n");
        stringBuilder.append("name: ").append(name).append("\n");
        stringBuilder.append("email: ").append(email).append("\n");
        stringBuilder.append("birthday: ")
                .append(calendar.get(Calendar.DAY_OF_MONTH))
                .append("/")
                .append(calendar.get(Calendar.MONTH) + 1)
                .append("/")
                .append(calendar.get(Calendar.YEAR))
                .append("\n");
        return stringBuilder.toString();
    }
}
