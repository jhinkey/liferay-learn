# インフラストラクチャー

インフラストラクチャカテゴリには、インポート/エクスポートプロセス中に検証されるコンテンツの種類と、インポート/エクスポートプロセス中に一時LARファイルを削除するかどうかを指定する設定が含まれています。

![仮想インスタンススコープでインポート/エクスポート設定を構成します。](./infrastructure/images/01.png)

これらの設定にアクセスするには、コントロールパネルを開き、*[設定]* → *[Instance Settings]* に移動し、[プラットフォーム]見出しの下の*[Infrastructure]* を選択します。

| 構成                               | 目的                                                                                                                                                         |
| -------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ファイルエントリの検証                      | オンにすると、一部のタイプのテキストコンテンツを公開またはインポートすると、Liferay DXPはコンテンツのドキュメントへのリンクをチェックし、各リンクが有効なドキュメントを指していることを確認します。                                                    |
| Journal Feedの参照を検証する             | オンにすると、一部のタイプのテキストコンテンツを公開またはインポートすると、Liferay DXPはコンテンツのWebコンテンツフィードへの参照をチェックし、各参照が有効なフィードを指していることを確認します。                                                  |
| レイアウトの参照を検証する                    | オンにすると、一部のタイプのテキストコンテンツを公開またはインポートすると、Liferay DXPのバーチャルホストを参照するリンクの検証がトリガーされ、各リンクがポータル内の有効なページを指していることが確認されます。 バーチャルホストにLiferay DXP以外のページがある場合は、これをオフにします。 |
| 欠落している参照を検証する                    | オンにすると、公開またはインポートにより、欠落している参照のチェックがトリガーされます。 オフにすると、欠落している参照の検証がスキップされ、既存のターゲットのない参照を対象のサイトに公開またはインポートできます。                                                |
| ステージング公開処理が失敗したときに一時的なLARを削除します。 | ステージング公開処理が失敗したときに一時LARが削除されないようにするには、チェックを外します。 リモートステージングコンテキストでは、これはステージング環境にのみ適用されます。                                                                  |
| ステージング公開処理が成功したときに一時的なLARを削除します。 | ステージング公開処理が成功したときに一時LARが削除されないようにするには、チェックを外します。 リモートステージングコンテキストでは、これはステージング環境にのみ適用されます。                                                                  |
| リモートサイトのバーチャルホストを使用します。          | リモート環境のバーチャルホストは、ステージサイトからリモートの本番環境サイトへアクセスするときに使用されます。                                                                                                    |