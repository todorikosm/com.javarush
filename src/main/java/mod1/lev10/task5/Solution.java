package mod1.lev10.task5;

/*
В этой задаче тебе нужно выполнить проверку URL-адреса.

Простая схема URL-адреса выглядит так:
<сетевой протокол>://<название ресурса>.<домен>

Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса,
полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса,
полученного входящим параметром, и возвращает результат проверки — строку название домена.

Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".

main не принимает участие в тестировании.
 */

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String urlType = null;
        if (url.startsWith("http")) {
            urlType = "http";
        } else if (url.startsWith("https")) {
            urlType = "https";
        } else {
            urlType = "неизвестный";
        }
        return urlType;
    }

    public static String checkDomain(String url) {
        String domainName = null;
        if (url.endsWith("com") ||
        url.endsWith("net") ||
        url.endsWith("org") ||
        url.endsWith("ru")) {
            domainName = url.substring(url.lastIndexOf(".") + 1);
        } else {
            domainName = "неизвестный";
        }
        return domainName;
    }
}
