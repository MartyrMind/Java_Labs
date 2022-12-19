package practs.pract_13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class task_6 {
    Map<String, List<String>> graph = new HashMap<>(); //граф
    Set<String> nodes = new HashSet<>(); //множество узлов графа
    List<String> chain = new ArrayList<>(); // массив для результата
    List<String> euler = new ArrayList<>(); // массив для хранения чего-то эйлерова
    Stack<String> vertexStack = new Stack<>(); // стек нод
    Stack<String> edgeStack = new Stack<>(); // стек ребер

    task_6(ArrayList<String> data) {
        for(String word : data) {
            nodes.add(firstLetterOf(word));
            nodes.add(lastLetterOf(word));
        }

        for (String node : nodes) {
            graph.put(node, new ArrayList<>());
        }

        for (String word : data) {
            List<String> edges = graph.get(firstLetterOf(word)); //получили список ребер для конкретной вершины
            edges.add(word); //добавили ребро
        }
    }
    String firstLetterOf(String word) { //возвращает первую букву слова
        return word.substring(0, 1).toLowerCase();
    }

    String lastLetterOf(String word) { //возвращает последнюю букву слова
        return word.substring(word.length() - 1).toLowerCase();
    }

    String getStartNode(ArrayList<String> words) {
        /*
        Считается, что данные корректны, то есть существует лишь две вершины с нечетной степенью (Эйлеров путь)
        Или их нет вообще (Эйлеров цикл). Таким образом, обходим ноды, считая полустепени их вершин.
        Потом находим вершины с нечетной степенью и возвращаем первую из них т.к. из нее исходит больше ребер чем входит.
         */
        Map<String, Integer[]> counter = new HashMap<>();
        for (String node : nodes) {
            Integer[] pows = {0, 0}; //полустепень входа, полустепень выхода
            counter.put(node, pows);
        }

        for (String word : words) {
            Integer[] cur_node_pow;

            cur_node_pow = counter.get(firstLetterOf(word));
            cur_node_pow[0] += 1;

            cur_node_pow = counter.get(lastLetterOf(word));
            cur_node_pow[1] += 1;

        }

        for (String node : counter.keySet()) {
            Integer[] pows = counter.get(node);
            if (pows[0] > pows[1]) {
                return node; //эйлеров путь
            }
        }
        return "any"; //эйлеров путь
    }

    void findChain(String startNode) {
        if (startNode.equals("any")) startNode = nodes.toArray(new String[0])[0];
        else vertexStack.push(startNode); //помещаем в стек ноду
        while(!vertexStack.empty()) {
            List<String> currentEdges = graph.get(vertexStack.peek()); //получили список ребер для конкретной вершины
            if(currentEdges.size() > 0) { //если есть ребра
                edgeStack.push(currentEdges.get(0)); //помещаем в стек ребро по которому перешли
                currentEdges.remove(0); //удалили ребро из списка ребер
                graph.put(vertexStack.peek(), currentEdges); //модифицируем наш граф
                String curNode = lastLetterOf(edgeStack.peek()); //новая текущая нода
                vertexStack.push(curNode); //помещаем в стек ноду
            } else { //если текущая вершина оказалась без ребер, то делаем шаг назад
                chain.add(vertexStack.pop()); //добавляем в цепочку ноду
                if (!vertexStack.empty()) euler.add(edgeStack.pop()); //в качестве ответа нас интересует ребро, а не нода
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //получили список городов
        ArrayList<String> words = new ArrayList<>();
        Path path = Path.of("C:\\WorkFolder\\Java&Kotlin\\Projects\\Java\\src\\practs\\pract_13\\source.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] wordsInLine = line.split(" ");
            for (String word : wordsInLine) {
                words.add(word);
            }
        }

        task_6 task = new task_6(words);
        String startNode = task.getStartNode(words);
        task.findChain(startNode);
        Collections.reverse(task.euler);
        System.out.println(task.euler);

    }
}
