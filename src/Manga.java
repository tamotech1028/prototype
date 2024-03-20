public class Manga implements Cloneable{
    // 漫画のタイトル
    public String title;
    // 漫画のページ
    public String[] page;

    @Override
    public Cloneable createClone() {
        Manga newManga = new Manga();
        newManga.setTitle(this.title);
        newManga.setPage(this.page);
        return newManga;
    }
    // 引数ありコンストラクタ
    public Manga(String title) {
        this.title = title;
    }
    // 引数なしコンストラクタ
    public Manga() {}

    // setter
    public void setTitle(String title) {
        this.title = title;
    }
    // setter
    public void setPage(String[] page) {
        this.page = page;
    }
}
