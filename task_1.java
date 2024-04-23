@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age; // Инициализируй поля класса в конструкторе
      this.result = result;
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        {22, true},
        {20, true},
        {17, false},
        {21, true},
    }; // Заполни массив тестовыми данными и ожидаемым результатом
    }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	boolean expectedResult = result; // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Ошибка возраст " + age + " несоответствует результату. Ожидаем " + result + ". Фактически: " + isAdult,result,isAdult);
	}
}
