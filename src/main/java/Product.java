public class Product {

    private Long id;
    private String title;
    private Long coast;

    public Product(Long id, String title, Long coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", coast=" + coast +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCoast() {
        return coast;
    }

    public void setCoast(Long coast) {
        this.coast = coast;
    }
}
