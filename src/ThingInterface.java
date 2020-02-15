
/*
 1. Данный интерфейс определяет два метода и предполагает, что классы которые его имплементируют определят, каким именно образом они это реализуют.
 	Исходя из принципов Expressive Coding речь идет о методах для поля name - имя объекта. Метод setName - устанавливает способ изменения поля name, а
 	метод getName - возвращает содержимое поля name. 
*/
public interface ThingInterface {
	public void setName(String name);
    public String getName();
}
