package com.example.practicalist
import com.example.practicalist.ui.theme.Contact
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.practicalist.R

import com.example.practicalist.ui.theme.PracticaListTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Contactlist(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

fun getContactList(): ArrayList<Contact> {
    return arrayListOf(
        Contact(1, "Ana", "Perez", "123456789", "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
        Contact(2, "Juan", "Gomez", "987654321", "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
        Contact(3, "Pedro", "Lopez", "456789123", "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
        Contact(4, "Maria", "Garcia", "789123456", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(5, "Luis", "Martinez", "321654987", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(6, "Carmen", "Sanchez", "654987321", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(7, "Jose", "Rodriguez", "147258369", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(8, "Lucia", "Hernandez", "369258147", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA" ),
        Contact(9, "Miguel", "Diaz", "258147369", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(10, "Sofia", "Alvarez", "159753486", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(11, "Andres", "Torres", "357159486", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(12, "Elena", "Ramirez", "753951486", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(13, "Javier", "Flores", "951357486", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(14, "Laura", "Vargas", "852456123", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA" ),
        Contact(15, "Diego", "Castro", "456123852", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(16, "Marta", "Rojas", "123852456", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA"),
        Contact(17, "Alvaro", "Mendez", "321654987","https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA" ),
        Contact(18, "Natalia", "Cruz", "987321654", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA" ),
        Contact(19, "Sergio", "Morales", "654123789","https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA" ),
        Contact(20, "Paula", "Ortiz", "789456123", "https://www.google.com/imgres?q=imagen%20de%20rostro%20de%20personas&imgurl=https%3A%2F%2Fimg.freepik.com%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_380164-119771.jpg&imgrefurl=https%3A%2F%2Fwww.freepik.es%2Ffotos-premium%2Fconcepto-personas-mujeres-retratos-cara-mujer-joven-sonriente-feliz_35825874.htm&docid=u4t7nBbsZv-xBM&tbnid=ym2DHfjhLYWdFM&vet=12ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA..i&w=626&h=626&hcb=2&ved=2ahUKEwij4d3ykraPAxUXAbkGHXSuFjkQM3oECCgQAA")
    )
}


@Composable
fun ContactItem(contact: Contact, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = contact.image, // <-- FIXED
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Column {
            Text(
                text = "${contact.name} ${contact.lastName}",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = contact.phone,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}




@Composable
fun Contactlist(modifier: Modifier = Modifier) {
    val contacts = getContactList()
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        items(contacts) { it ->
            ContactItem(it)
            Divider(color = Color.Gray, thickness = 1.dp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ContactListPreview() {
    PracticaListTheme {
        Contactlist()
    }
}

@Preview(showBackground = true)
@Composable
fun ContactItemPreview() {
    PracticaListTheme {
        ContactItem(
            Contact(
                1,
                "Ana",
                "Perez",
                "123456789",
                "https://randomuser.me/api/portraits/women/1.jpg" // <-- FIXED
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MessageListPreview() {
    PracticaListTheme {
        MessageList()
    }
}

@Composable
fun MessageList(modifier: Modifier = Modifier) {
    val nameList = arrayListOf(
        "Ana", "Juan", "Pedro", "Maria", "Luis", "Carmen", "Jose", "Lucia", "Miguel", "Sofia"
    )
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(nameList) { it ->
            Text(text = it, modifier = modifier.padding(8.dp))
        }
    }
}