# 新しい商品カテゴリの作成

商品カテゴリは、商品を整理するために使用されます。 これらのグループ化により、複数の商品を単一のユニットとして扱うことができます。 たとえば、商品カテゴリを使用して、一連の商品に割引やその他のオファーを適用したり、購入者が商品を見つけやすくしたり、特定の商品を特定のアカウントまたはアカウントグループにプロモートしたりできます。

## ボキャブラリの作成

1.  *[Control Panel]* → ![Navigation Compass](../../../images/icon-compass.png) *[Go to Other Site]* → *[My Sites]* → *[Global]* に移動します。

2.  *[Global]* サイトで、*[Categorization]* → *[Categories]* をクリックします。

3.  最初にボキャブラリを作成するには、（+）ボタンをクリックします。

4.  次のように入力します：

      - **Name**: 化粧品

      - **Description**: すべての化粧品

      - **Allow Multiple Categories**: Yes

      - **Choose Asset Type**: Commerce商品

      - **Required**: Yes

        ![ボキャブラリの作成](./creating-a-new-product-category/images/01.png)

5.  *[Save]* をクリックします。

新しいボキャブラリが作成され、カテゴリを追加できるようになりました。

| フィールド      | 説明                                           |
| ---------- | -------------------------------------------- |
| 名前         | ボキャブラリの名前                                    |
| 説明         | ボキャブラリの説明                                    |
| 複数のカテゴリを許可 | 1対1または1対多の関係を許可するトグル                         |
| アセットタイプを選択 | コマース商品を含むLiferay DXPのすべてのアセットタイプのリスト         |
| 必須事項       | すべてのコマース商品にカテゴリを関連付ける必要があるかどうかを制御するために切り替えます |

## カテゴリ作成

カテゴリはネストできるため、ストア所有者はサブカテゴリを使用してカテゴリを整理できます。 たとえば、*[Hair Products]* というカテゴリには、*[Shampoo]*、*[Hair Gels]*、*[Color Dyes]* などの独自のサブカテゴリを設定できます。

カテゴリを作成するには：

1.  カテゴリを追加するボキャブラリをクリックします。 前の例を続けるには、*[Cosmetics]* をクリックします。

2.  （+）ボタンをクリックして、新しいカテゴリを追加します。

3.  次のように入力します：

      - **Name**: ヘア商品
      - **Description**: すべてのヘア商品

    ![カテゴリ作成](./creating-a-new-product-category/images/02.png)

4.  *[Save]* をクリックします。

新しいカテゴリが作成されました。 階層内で並行する別の商品に別のカテゴリを作成したり、上記の説明でネストされたサブカテゴリを作成したりできます。 サブカテゴリを作成するには、*[Hair Products]* リンクをクリックし、（+）ボタンをクリックして別のカテゴリを作成します。 新しいカテゴリが作成されると、階層を階層リンクナビゲーションで確認できます。

![サブカテゴリ](./creating-a-new-product-category/images/03.png)

## 商品カテゴリの構成

カテゴリは階層的にネストされます。 これにより、複数のカテゴリをグループ化して単一のユニットとして扱うことができますが、管理者がボキャブラリ全体を表示することが難しくなる場合もあります。 すべてのカテゴリを一度に表示することができます。

商品カテゴリの階層を構成するには：

1.  *[Control Panel]* → *[Configuration]* → *[System Settings]* に移動します。

2.  [コンテンツ]セクションの[ *アセット* クリックし* 。</p></li>

3

左側のメニューの *Asset Categories Web* で、 *Category Navigation Display Style* ドロップダウンメニューから *Flattened Tree* 選択します。

    ![アセットカテゴリWeb](./creating-a-new-product-category/images/04.png)

4

*[Save]* をクリックして変更を適用します。 いつでもデフォルトのビューに戻すことができます。</ol>

## 次のステップ

  - [商品カテゴリを使用してカタログを整理する](./organizing-your-catalog-with-product-categories.md)
