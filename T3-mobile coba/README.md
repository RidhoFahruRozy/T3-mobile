# T3-mobile — Form Identitas Mahasiswa

**Nama  :** [Nama Mahasiswa]  
**NIM   :** [NIM Mahasiswa]  
**Tugas :** Praktikum Pemrograman Mobile — Tugas 3

---

## Deskripsi Aplikasi

Aplikasi Android sederhana berupa form identitas mahasiswa. Pengguna dapat mengisi nama, memilih jenis kelamin, dan memilih hobi. Setelah tombol **Tampilkan** diklik, semua data ditampilkan di bawah tombol dalam format yang rapi.

## Fitur

- ✅ Input nama lengkap menggunakan `EditText`
- ✅ Pilihan jenis kelamin menggunakan `RadioGroup` + `RadioButton`
- ✅ Pilihan hobi menggunakan `CheckBox` (4 pilihan)
- ✅ Tombol `Button` untuk memproses dan menampilkan data
- ✅ Hasil ditampilkan di `TextView`
- ✅ Validasi: nama kosong → `EditText.error` + `Toast`
- ✅ Validasi: jenis kelamin tidak dipilih → `Toast`

## Layout yang Digunakan

| Layout | Kegunaan |
|---|---|
| `LinearLayout` (vertical) | Root/container utama |
| `LinearLayout` (horizontal) | Menyusun CheckBox berdampingan |
| `RadioGroup` (horizontal) | Menyusun RadioButton Laki-laki & Perempuan |
| `CardView` | Container visual untuk tiap section |
| `ScrollView` | Agar halaman bisa di-scroll |

## Struktur Proyek

```
T3-mobile/
├── app/src/main/
│   ├── java/com/example/t3mobile/
│   │   └── MainActivity.kt        ← Logika Kotlin
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml  ← Layout UI
│   │   ├── values/
│   │   │   ├── colors.xml
│   │   │   ├── strings.xml
│   │   │   └── themes.xml
│   │   └── drawable/
│   │       └── edittext_bg.xml
│   └── AndroidManifest.xml
├── app/build.gradle
├── build.gradle
└── settings.gradle
```

## Screenshot

> *(Tambahkan screenshot aplikasi di sini setelah di-build)*
