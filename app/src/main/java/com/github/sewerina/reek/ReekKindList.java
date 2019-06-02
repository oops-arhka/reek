package com.github.sewerina.reek;

import java.util.ArrayList;

public class ReekKindList extends ArrayList<ReekKind> {
    public ReekKindList() {
        add(new ReekKind("Гарь", "гари", R.drawable.gar));
        add(new ReekKind("Запах канализации", "канализации", R.drawable.canalization));
        add(new ReekKind("Сероводород (запах тухлых яиц)", "cероводорода", R.drawable.eggs));
        add(new ReekKind("Зловоние от свалки мусора/Свалочный газ", "свалочного газа", R.drawable.garbage));
        add(new ReekKind("Выхлопы от автомобилей", "выхлопных газов", R.drawable.exhaust));
    }
}
