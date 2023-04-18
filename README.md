# MultSwitch

[![](https://jitpack.io/v/elapsefeather/MultSwitch.svg)](https://jitpack.io/#elapsefeather/MultSwitch)
自定義滑動樣式選單 SwtichBtn

## sample

<table>
    <tr>
        <th>推薦方式</th>
        <th>。項目文字長度差異不大<br>。項目數量少<br>。全頁面寬</th>
        <th>。項目文字長短不一<br>。項目數量多<br>。需要滑動</th>
    </tr>
    <tr>
        <td>建議設置</td>
        <td>項目等寬，不可滑動 <br> tabWidth="max" <br> isScroll="false" </td>
        <td>項目最適寬度，可滑動 <br> tabWidth="auto" <br> isScroll="true" </td>
    </tr>
    <tr>
        <td>演示</td>
        <td><img src="./screenshots/multSwitch.gif" width="200"></td>
        <td><img src="./screenshots/multTabLayout.gif" width="200"></td>
    </tr>
</table>

## Setup

The easiest way to add the **MultSwitch** library to your project is by adding it as a dependency to
your build.gradle

**Step 1.** Add the JitPack repository to your build file

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency

```gradle
dependencies {
    implementation 'com.github.elapsefeather:MultSwitch:2.0.1'
}
```

## parameter

| parameter             | parameter type    | effect            |
| -------------         |-------------      |-------------      |
| strokeRadius          | dimension         | 選項圓角          |
| strokeWidth           | dimension         | 選項寬度          |
| indicatorWidth        | dimension         | 指示器寬度        |
| indicatorHeight       | dimension         | 指示器高度        |
| textSize              | dimension         | 選項字體大小      |
| typeface              |string             | 字體字型          |
| selectedColor         | color\|reference  | 選中色            |
| selectedTextColor     | color\|reference  | 選中字體色        |
| unselectedColor       | color\|reference  | 未選中色          |
| unselectedTextColor   | color\|reference  | 未選中字體色      |
| switchTabs            | reference[array]  | 選項列表          |
| selectedTab           | integer           | 預設選項          |
| blockStyle            | blockStyle        | 可選樣式： <br> original <br> brim <br> rounded <br> bottomLine <br> bottomShortLine |
| mutiLine              | boolean           | 選項是否自動換行（僅支援至 v1.0.0）|
| isScroll              | boolean           | 選項是否可滑動（於 v2.0.0 開始支援）|

## Usage

### v2.0.0

 ```       
    <com.elapsefeather.lib.MultTabLayout
        android:id="@+id/multSwitch4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:padding="8dp"
        app:blockStyle="rounded"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/multSwitch3"
        app:selectedColor="#ED99B6"
        app:selectedTextColor="#fff"
        app:strokeRadius="20dp"
        app:strokeWidth="1dp"
        app:switchTabs="@array/tab1"
        app:textSize="18dp"
        app:unselectedTextColor="#E91E63" />
```

### v1.0.0

```
    <com.elapsefeather.lib.MultSwitch
        android:id="@+id/multSwitch4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:padding="8dp"
        app:blockStyle="rounded"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/multSwitch3"
        app:selectedColor="#ED99B6"
        app:selectedTextColor="#fff"
        app:strokeRadius="20dp"
        app:strokeWidth="1dp"
        app:switchTabs="@array/tab1"
        app:textSize="18dp"
        app:unselectedTextColor="#E91E63" />
```

## Version History

> ### v2.0.0(2023/04/13)
> - 增加可滑動設置
> - 停止項目文字換行功能

> ### v1.0.0(2022/10/01)
> - new project.
