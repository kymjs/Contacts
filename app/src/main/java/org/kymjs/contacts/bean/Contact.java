package org.kymjs.contacts.bean;

/**
 * 联系人javabean
 *
 * @author kymjs (http://www.kymjs.com/) on 9/16/15.
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private int id;
    private String url;
    private String pinyin;
    private char firstChar;

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
        String first = pinyin.substring(0, 1);
        if (first.matches("[A-Za-z]")) {
            firstChar = first.toUpperCase().charAt(0);
        } else {
            firstChar = '#';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getFirstChar() {
        return firstChar;
    }

    @Override
    public int compareTo(Contact another) {
        return this.pinyin.compareTo(another.getPinyin());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Contact) {
            return this.id == ((Contact) o).getId();
        } else {
            return super.equals(o);
        }
    }
}
