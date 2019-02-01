/**
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]

**/


String[] addBorder(String[] picture) {

String[]result=new String[picture.length+2];
int size= picture[0].length()+2;
StringBuilder sb = new StringBuilder();
    
    //top and bottom row are the same
    for(int i=0; i <size;i++){
        sb.append('*');
    }
    String topBottom=sb.toString();
    
    result[0]=topBottom;
    
    StringBuilder addBorder = new StringBuilder();

    //using string builder to add boarder for other rows
    for(int row=0;row<picture.length;row++){
        String temp=picture[row];
        addBorder.append('*').append(temp).append('*');    
        result[row+1]=addBorder.toString();
        addBorder.setLength(0);
    }
    
    result[picture.length+1]=topBottom;
    
    return result;
}
