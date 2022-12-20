package model;

import javafx.scene.image.Image;

import java.io.File;

public class ImageCollection implements Aggregate {

        private File[] img_list;
        private Image img_to_show;

        public ImageCollection(File[] img_list) {
            this.img_list = img_list;
        }
    private class ImageIterator implements Iterator {
            int count = 0;
            @Override
            public boolean hasNext() {
                try {
                    img_to_show = new Image(img_list[count].toString().replace("\\", "/"));
                    return true;
                } catch (Exception ex) {
                    System.out.println("Неудалось загрузить картинку!");
                    return false;
                }
            }
            @Override
            public boolean hasPrev() {
                try {
                    img_to_show = new Image(img_list[count].toString().replace("\\", "/"));
                    return true;
                } catch (Exception ex) {
                    System.out.println("Неудалось загрузить картинку!");
                    return false;
                }
            }
            @Override
            public Object next() {
                if (count < img_list.length-1){
                    count ++;
                }else if(count ==  img_list.length-1){
                    count = 0;
                }

                if(this.hasNext()){
                    return img_to_show;
                }
                return null;
            }
        @Override
        public Object prev() {

                System.out.println(count);

            if (count-1 > 0){
                count --;
            }else{
                count = 0;
            }

            if(this.hasPrev()){
                return img_to_show;
            }
            return null;
        }

        @Override
            public Object preview() {
                count = 0;
                return new Image(img_list[count].toString().replace("\\", "/"));
            }
        }

        @Override
        public Iterator getIterator() {
            return new ImageIterator();
        }
}
