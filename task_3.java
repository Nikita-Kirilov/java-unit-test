@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expectedResult = true;
	assertEquals("Ошибка, пользователю меньше 18 лет", expectedResult, isAdult);
}
