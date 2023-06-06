import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EntryFindTest extends BaseInfo{
    EntryFind entryFind = new EntryFind(getDriver());

  @Before
        public void openPage() {
     openUrl();
 }

  @Test // тестирование с техникой тест дизайн по классу эквивалентности
  @Description("Проверка поля ввода-вводим буквы")
        public void sendKeysFillSearchField() {
        entryFind.enterFillSearchField();
        entryFind.clickButtonSearch();

  }

  @Test
  @Description("Проверка поля ввода-вводим цифры")
    public void sendKeysFillSearchField1() {
        entryFind.enterFillSearchField1();
        entryFind.clickButtonSearch();}

  @Test
  @Description("Проверка поля ввода-вводим знаки")
    public void sendKeysFillSearchField2() {
        entryFind.enterFillSearchField2();
        entryFind.clickButtonSearch();

  }
    @Test
    @Description("Проверка поля ввода-один знак")
    public void sendKeysFillSearchField3() {
        entryFind.enterFillSearchField3();
        entryFind.clickButtonSearch();

  }
    @Test
    @Description("Проверка поля ввода-пустое поле")
    public void sendKeysFillSearchField4() {
        entryFind.enterFillSearchField4();
        entryFind.clickButtonSearch();
  }

  @After
        public void quitDriver(){
        baseAfter(getDriver());
       }
}
