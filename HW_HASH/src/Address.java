import java.util.Objects;

public class Address {
    private String county;
    private String city;

    public Address(String county, String city) {
        this.county = county;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        Address address = (Address) obj;
        return county.equals(address.county) && city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(county, city);
    }
}
