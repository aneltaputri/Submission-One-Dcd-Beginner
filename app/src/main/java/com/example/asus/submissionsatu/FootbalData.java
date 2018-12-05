package com.example.asus.submissionsatu;

import java.util.ArrayList;

public class FootbalData {
    private static String[] title = new String[]{"Real Madrid","AC Milan","FC Barcelona",
            "Bayern Munchen","Chelsea FC","Manchester United","Arsenal FC"};

    private static String[] detail = new String[]{"Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol.",
    "Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia",
    "Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol.",
    "FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bavaria",
    "Chelsea FC adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London.",
    "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya",
    "Arsenal FC adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London."};

    private static int[] thumbnail = new int[]{R.drawable.img_madrid,R.drawable.img_acm,
    R.drawable.img_barca,R.drawable.img_bayern,R.drawable.img_chelsea,R.drawable.img_mu,
    R.drawable.img_arsenal};

    public static ArrayList<FootbalModel> getListData(){
        FootbalModel footbalModel = null;
        ArrayList<FootbalModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            footbalModel = new FootbalModel();
            footbalModel.setThumbnail(thumbnail[i]);
            footbalModel.setTitle(title[i]);
            footbalModel.setDetail(detail[i]);
            list.add(footbalModel);
        }
        return list;
    }
}
