package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.4f)
                .statusBarsPadding()
                .padding(15.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Text(
                text = "0",
                fontSize = 45.sp,
                fontWeight = FontWeight.Black
            )
        }


        Divider(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 20.dp, topEnd = 20.dp
                    )
                )
                .navigationBarsPadding()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
            ) {

                //////////Top/////////////
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    CalButton(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f),
                        label = "C"
                    )

                    CalButton(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f), label = "/"
                    )
                    CalButton(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f), label = "*"
                    )
                    CalButton(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f), label = "-"
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))


                ///////////////Middle///////////////
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "7"
                        )

                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "4"
                        )

                    }


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "8"
                        )

                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "5"
                        )

                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "9"
                        )

                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "6"
                        )

                    }


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {


                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "+"
                        )

                    }


                }

                Spacer(modifier = Modifier.height(8.dp))

                /////////////Bottom/////////////

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    Column(
                        modifier = Modifier.weight(3f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Row(
                            modifier = Modifier.weight(1f),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            CalButton(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f), label = "1"
                            )
                            CalButton(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f), label = "2"
                            )
                            CalButton(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f), label = "3"
                            )
                        }

                        Row(
                            modifier = Modifier.weight(1f),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            CalButton(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(2f), label = "0"
                            )
                            CalButton(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f), label = "."
                            )

                        }


                    }


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {


                        CalButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f), label = "="
                        )

                    }


                }


            }
        }

    }
}


@Composable
fun CalButton(
    modifier: Modifier = Modifier, label: String, color: Color = Color.Gray
) {
    Box(
        modifier = modifier
            .clip(MaterialTheme.shapes.small)
            .background(color.copy(alpha = 0.2f)),
        contentAlignment = Alignment.Center
    ) {
        Text(text = label, fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}