import java.net.*;

public class URLDepthPair { //хранит совместно юрл и глубину (текущую для этой ссылки)
    private URL url;
    private int depth;

    public URLDepthPair(String url, int depth) throws MalformedURLException{ //конструктор
        this.url = new URL(url); //создаёт юрл
        this.depth = depth; //сохраняет глубину
    }

    //геттеры получают приватные переменные
    public URL getUrl(){
        return url;
    }

    public int getDepth() {
        return depth;
    }

    public String toString(){ //выводит объект в консоль
        return url.toString() + " " + depth;
    }

    //переопределяются вместе
    @Override
    public boolean equals(Object o){ //чтобы могли сравниваться две ссылки
        if(o instanceof URLDepthPair p){
            return url.equals(p.url); //сравнивает только объекты типа юрл, тк длина не нужна
        }
        return false;
    }
    @Override
    public int hashCode(){
        return url.hashCode();
    }
}
