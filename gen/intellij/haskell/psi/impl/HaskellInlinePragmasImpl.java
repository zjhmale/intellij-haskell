// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;

public class HaskellInlinePragmasImpl extends HaskellCompositeElementImpl implements HaskellInlinePragmas {

  public HaskellInlinePragmasImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitInlinePragmas(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellInlineFusedPragma getInlineFusedPragma() {
    return PsiTreeUtil.getChildOfType(this, HaskellInlineFusedPragma.class);
  }

  @Override
  @Nullable
  public HaskellInlineInnerPragma getInlineInnerPragma() {
    return PsiTreeUtil.getChildOfType(this, HaskellInlineInnerPragma.class);
  }

  @Override
  @Nullable
  public HaskellInlinePragma getInlinePragma() {
    return PsiTreeUtil.getChildOfType(this, HaskellInlinePragma.class);
  }

  @Override
  @Nullable
  public HaskellNoinlinePragma getNoinlinePragma() {
    return PsiTreeUtil.getChildOfType(this, HaskellNoinlinePragma.class);
  }

}
