import org.w3c.dom.Node;

/**
 * Общий интерфейс для создания плагинов. Производит парсинг получаемого
 * xml-документа в соответствии с задаваемыми параметрами
 */
public interface Plugin {

	/** Возвращает результат парсинга xml-документа */
	public String getData();

	/** Возаращает имя команды */
	public String getCommandName();

	/** Производит парсинг xml-документа */
	public void getResult(Node node, String word);
}
