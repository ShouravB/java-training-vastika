package chasebank;

import java.util.Objects;

public class Menu {

    /*
        menu id => int
        name => string
        slug => string
        is External => boolean
        external url => String
        is Active => Boolean
        parent id => int
        is leaf => boolean
        language id => int
     */

    int menuId;
    String menuName;
    String slug;
    boolean isExternal;
    String externalURL;
    boolean isActive;
    int parentId;
    boolean isLeaf;
    int languageId;

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", slug='" + slug + '\'' +
                ", isExternal=" + isExternal +
                ", externalURL='" + externalURL + '\'' +
                ", isActive=" + isActive +
                ", parentId=" + parentId +
                ", isLeaf=" + isLeaf +
                ", languageId=" + languageId +
                '}';
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuId == menu.menuId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId);
    }
}
