package com.example.nearnest.Activities.Dashboard.Map

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.nearnest.Activities.Dashboard.Results.ItemsNearest
import com.example.nearnest.Domain.StoreModel
import com.example.nearnest.R
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

class MapActivity : AppCompatActivity() {
    private lateinit var item: StoreModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            item = intent.getSerializableExtra("object") as StoreModel

            val latitude = item.Latitude
            val longitude = item.Longitude
            MapScreen(LatLng(latitude, longitude), item)
        }
    }
}

@Composable
fun MapScreen(latlng: LatLng, item: StoreModel){
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(latlng, 15f)
    }
    val context = LocalContext.current
    ConstraintLayout {
        val (map, detail) = createRefs()

        GoogleMap(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(map) {
                    centerTo(parent)
                },
            cameraPositionState = cameraPositionState
        ) {
            Marker(state = MarkerState(position = latlng), title = "Location Marker")
        }

        LazyColumn(
            modifier = Modifier
                .wrapContentHeight()
                .padding(horizontal = 24.dp, vertical = 32.dp)
                .fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .padding(16.dp)
                .constrainAs(detail) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            item { ItemsNearest(item) }
            item {
                Button(
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(R.color.blue)
                    ),
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    onClick = {
                        val phoneNumber = "tel:" + item.Call
                        val diaIntent = Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber))
                        context.startActivity(diaIntent)
                    }
                ) {
                    Text(
                        "Call to Store",
                        fontSize = 18.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
