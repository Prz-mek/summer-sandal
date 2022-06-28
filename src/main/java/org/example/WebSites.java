package org.example;

public class WebSites {
    public static final String HOME =
            "<h1>Witaj w manager pracownikow</h1>" +
                    "<form action=\"\" method=\"post\" >\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <label for=\"firstName\">Imie pracownika: </label>\n" +
                    "    <input type=\"text\" name=\"firstName\" id=\"firstName\" required>\n" +
                    "  </div>\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <label for=\"lastName\">Nazwisko pracownika: </label>\n" +
                    "    <input type=\"text\" name=\"lastName\" id=\"lastName\" required>\n" +
                    "  </div>\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <label for=\"salary\">Pensja pracownika: </label>\n" +
                    "    <input type=\"number\" name=\"salary\" id=\"salary\" required>\n" +
                    "  </div>\n" +
                    "  <div class=\"form-example\">\n" +
                    "    <input type=\"submit\" value=\"Dodaj\">\n" +
                    "  </div>\n" +
                    "</form>";
}
