package com.example.mvvm.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
){
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by rememberSaveable { mutableStateOf("") }
    var txtGender by rememberSaveable { mutableStateOf("") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)
    Scaffold(modifier = Modifier,
        { TopAppBar(title = { Text(stringResource(id = R.string.app_name), color = Color.white)},
            colors = TopAppBarDefaults.mediumAppBarColors(colorResource(id = R.color.purple_500))
        )
        }) { isiRuang ->

        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalDivider(
                modifier = Modifier
                    .padding(12.dp)
                    .width(250.dp),
                thickness = dimensionResource(R.dimen.thickness_divider),
                color = Color.Blue
            )
            OutlinedTextField(
                value = txtNama,
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.width(250.dp).padding(top = 20.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {
                    txtNama = it
                }
            )