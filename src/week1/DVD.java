package week1;

class DVD extends LibraryItem {
    String director;
    int playtime;

    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", playtime=" + playtime +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", available=" + available +
                '}';
    }
}